package irvine.oeis.a090;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A090149 Primes of the form identical digits preceded by a 1.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A090149 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  /** Construct the sequence. */
  public A090149() {
    this(1, 3, 7, 9);
  }

  /**
   * Generic constructor with parameter
   * @param seeds digits allowed to start the number
   */
  public A090149(final int... seeds) {
    for (final int v : seeds) {
      mA.add(Z.valueOf(10 + v));
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.pollFirst();
      mA.add(t.multiply(10).add(t.mod(10)));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

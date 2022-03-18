package irvine.oeis.a089;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A089345 Primes of the form identical even digits followed by a 1.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A089345 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();

  /** Construct the sequence. */
  public A089345() {
    this(2, 4, 6, 8);
  }

  /**
   * Generic constructor with parameter
   * @param seeds digits allowed to start the number
   */
  protected A089345(final int... seeds) {
    for (final int v : seeds) {
      mA.add(Z.valueOf(v));
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.pollFirst();
      final Z u = t.multiply(10);
      mA.add(u.add(t.mod(10)));
      final Z v = u.add(1);
      if (v.isProbablePrime()) {
        return v;
      }
    }
  }
}

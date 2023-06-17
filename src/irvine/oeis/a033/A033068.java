package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A033068 Numbers with the property that all pairs of consecutive base-3 digits differ by 1.
 * @author Sean A. Irvine
 */
public class A033068 extends AbstractSequence {

  /** Construct the sequence. */
  public A033068() {
    super(1);
  }

  private final TreeSet<Z> mA = new TreeSet<>();

  {
    for (long k = start(); k < base(); ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  protected long start() {
    return 1;
  }

  protected int base() {
    return 3;
  }

  protected long diff() {
    return 1;
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final long d = res.mod(base());
    final Z t = res.multiply(base());
    if (!t.isZero()) {
      for (long k = 0; k < base(); ++k) {
        if (Math.abs(d - k) == diff()) {
          mA.add(t.add(k));
        }
      }
    }
    return res;
  }
}

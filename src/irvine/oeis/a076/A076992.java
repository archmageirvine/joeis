package irvine.oeis.a076;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A076992 Given a(1), ..., a(n-1), a(n) is minimal such that all terms of the sequence are distinct positive integers and, for all k&gt;=1, the sum of the k terms from a(k) to a(2k-1) is a k-th power.
 * @author Sean A. Irvine
 */
public class A076992 extends CachedSequence {

  /** Construct the sequence. */
  public A076992() {
    super(1);
  }

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = Z.TWO;

  @Override
  protected Z compute(final Z n) {
    if (Z.ONE.equals(n)) {
      return Z.ONE;
    }
    if (n.isEven()) {
      while (mUsed.remove(mA)) {
        mA = mA.add(1);
      }
      mUsed.add(mA);
      return mA;
    } else {
      if (Z.THREE.equals(n)) {
        mUsed.add(Z.SEVEN);
        return Z.SEVEN;
      }
      Z k = n.divide2().add(1);
      Z t = Z.THREE.pow(k);
      while (k.compareTo(n) < 0) {
        t = t.subtract(a(k));
        k = k.add(1);
      }
      mUsed.add(t);
      return t;
    }
  }
}

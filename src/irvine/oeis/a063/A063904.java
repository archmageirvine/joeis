package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063904 a(1) = 2, a(2) = 3 and a(k+1) is the least prime not already chosen that divides some a(i)*a(j)+1, where 1&lt;=i&lt;j&lt;=k.
 * @author Sean A. Irvine
 */
public class A063904 extends A063884 {

  /** Construct the sequence. */
  public A063904() {
    super(1);
  }

  @Override
  protected Z computeNext() {
    final Z t = mA.pollFirst();
    mUsed.add(t);
    for (final Z v : this) {
      update(v.multiply(t).add(1));
    }
    return t;
  }
}

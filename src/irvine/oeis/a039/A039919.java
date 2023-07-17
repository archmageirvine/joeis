package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a002.A002212;

/**
 * A039919 Related to enumeration of edge-rooted catafusenes.
 * @author Sean A. Irvine
 */
public class A039919 extends A002212 {

  /** Construct the sequence. */
  public A039919() {
    super(1);
  }

  private Z mSum = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z u = mSum;
    mSum = mSum.add(t);
    return t.subtract(u);
  }
}

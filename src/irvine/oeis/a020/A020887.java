package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020887 Ordered set of a <code>+ b -</code> c as <code>(a,b,c)</code> runs through all primitive Pythagorean triples with a&lt;b&lt;c.
 * @author Sean A. Irvine
 */
public class A020887 extends A020888 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

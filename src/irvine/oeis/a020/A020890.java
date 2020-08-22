package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020890 Ordered set of (b + c - a)/2 as (a,b,c) runs through all primitive Pythagorean triples with a&lt;b&lt;c.
 * @author Sean A. Irvine
 */
public class A020890 extends A020889 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

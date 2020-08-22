package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020892 Ordered set of (c + a - b)/2 as (a,b,c) runs through all primitive Pythagorean triples with a&lt;b&lt;c.
 * @author Sean A. Irvine
 */
public class A020892 extends A020891 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.a001.A001075;

/**
 * A016064 Shortest legs of Heronian triangles (sides are consecutive integers, area is an <code>integer)</code>.
 * @author Sean A. Irvine
 */
public class A016064 extends A001075 {

  @Override
  public Z next() {
    return super.next().multiply2().subtract(1);
  }
}

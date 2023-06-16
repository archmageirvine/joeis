package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a046.A046080;

/**
 * A063468 Number of Pythagorean triples in the range [1..n], i.e., the number of integer solutions to x^2 + y^2 = z^2 with 1 &lt;= x,y,z &lt;= n.
 * @author Sean A. Irvine
 */
public class A063468 extends PartialSumSequence {

  /** Construct the sequence. */
  public A063468() {
    super(1, new A046080());
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

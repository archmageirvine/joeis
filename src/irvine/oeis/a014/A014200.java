package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002654;

/**
 * A014200 Number of solutions to x^2 + y^2 &lt;= n, excluding (0,0), divided by 4.
 * @author Sean A. Irvine
 */
public class A014200 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014200() {
    super(new PrependSequence(new A002654(), Z.ZERO));
  }
}

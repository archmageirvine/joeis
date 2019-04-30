package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002654;

/**
 * A014200 Number of solutions to <code>x^2 + y^2 &lt;= n</code>, excluding <code>(0,0)</code>, divided by 4.
 * @author Sean A. Irvine
 */
public class A014200 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014200() {
    super(new PrependSequence(new A002654(), Z.ZERO));
  }
}

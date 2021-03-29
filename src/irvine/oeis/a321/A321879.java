package irvine.oeis.a321;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007434;

/**
 * A321879 Partial sums of the Jordan function J_2(k), for 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A321879 extends PartialSumSequence {

  /** Construct the sequence. */
  public A321879() {
    super(new PrependSequence(new A007434(), Z.ZERO));
  }
}

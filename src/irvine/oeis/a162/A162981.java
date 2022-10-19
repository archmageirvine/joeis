package irvine.oeis.a162;
// manually partran at 2022-10-18 05:00

import irvine.oeis.PrependSequence;
import irvine.oeis.a004.A004148;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A162981 Number of Dyck paths with no UUU's and no DDD's of semilength n and having k returns to the x-axis (1 &lt;= k &lt;= n; U=(1,1), D=(1,-1)).
 * @author Georg Fischer
 */
public class A162981 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A162981() {
    super(1, new PrependSequence(new A004148(), 1));
  }
}

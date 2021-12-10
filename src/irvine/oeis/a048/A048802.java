package irvine.oeis.a048;

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.Stirling2TransformSequence;
import irvine.oeis.a000.A000169;

/**
 * A048802 Number of labeled rooted trees of nonempty sets with n points. (Each node is a set of 1 or more points.).
 * @author Sean A. Irvine
 */
public class A048802 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A048802() {
    super(new PrependSequence(new A000169(), 0), 0);
    next();
  }
}

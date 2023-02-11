package irvine.oeis.a057;

import irvine.oeis.a160.A160447;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A057008 Number of conjugacy classes of subgroups of index n in free group of rank 5.
 * @author Sean A. Irvine
 */
public class A057008 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A057008() {
    super(1, new A160447(), 1);
    next();
  }
}

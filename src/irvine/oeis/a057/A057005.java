package irvine.oeis.a057;

import irvine.oeis.a110.A110143;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A057005 Number of conjugacy classes of subgroups of index n in free group of rank 2.
 * @author Sean A. Irvine
 */
public class A057005 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A057005() {
    super(new A110143(), 1);
    next();
  }
}

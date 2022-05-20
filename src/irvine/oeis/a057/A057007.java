package irvine.oeis.a057;

import irvine.oeis.a160.A160446;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A057007 Number of conjugacy classes of subgroups of index n in free group of rank 4.
 * @author Sean A. Irvine
 */
public class A057007 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A057007() {
    super(new A160446());
  }
}

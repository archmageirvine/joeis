package irvine.oeis.a057;

import irvine.oeis.a152.A152612;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A057006 Number of conjugacy classes of subgroups of index n in free group of rank 3.
 * @author Sean A. Irvine
 */
public class A057006 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A057006() {
    super(1, new A152612());
  }
}

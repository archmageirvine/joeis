package irvine.oeis.a385;

import irvine.oeis.a079.A079564;
import irvine.oeis.transform.EulerTransform;

/**
 * A385697 allocated for Jim Nastos.
 * @author Sean A. Irvine
 */
public class A385697 extends EulerTransform {

  /** Construct the sequence. */
  public A385697() {
    super(1, new A079564());
  }
}

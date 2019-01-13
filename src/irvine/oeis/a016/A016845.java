package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016845.
 * @author Sean A. Irvine
 */
public class A016845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016845() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {19683, 40353607, 2357947691L, 38443359375L, 322687697779L, 1801152661463L, 7625597484987L, 26439622160671L, 78815638671875L, 208728361158759L});
  }
}

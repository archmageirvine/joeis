package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249076.
 * @author Sean A. Irvine
 */
public class A249076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249076() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 64, 46656, 2985984, 64000000, 729000000, 5489031744L, 30840979456L, 139314069504L, 531441000000L, 1771561000000L, 5289852801024L, 14412774445056L});
  }
}

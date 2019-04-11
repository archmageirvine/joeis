package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199418 <code>3*7^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199418() {
    super(new long[] {-7, 8}, new long[] {4, 22});
  }
}

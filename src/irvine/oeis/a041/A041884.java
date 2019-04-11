package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041884 Numerators of continued fraction convergents to <code>sqrt(464)</code>.
 * @author Sean A. Irvine
 */
public class A041884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041884() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19602, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {21, 22, 43, 237, 280, 517, 797, 4502, 5299, 9801, 416941, 426742, 843683, 4645157, 5488840, 10133997, 15622837, 88248182, 103871019, 192119201});
  }
}

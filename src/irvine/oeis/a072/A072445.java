package irvine.oeis.a072;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A072444.
 * @author Sean A. Irvine
 */
public class A072445 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A072445() {
    super(0, new A072444(), 1);
  }
}

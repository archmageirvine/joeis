package irvine.oeis.a242;
// manually euleras at 2021-11-23 12:41

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001867;

/**
 * A242587 The number of conjugacy classes of n X n matrices over F_3.
 * @author Georg Fischer
 */
public class A242587 extends EulerTransform {

  /** Construct the sequence. */
  public A242587() {
    super(new SkipSequence(new A001867(), 1), 1);
  }
}

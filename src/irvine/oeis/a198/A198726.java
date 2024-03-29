package irvine.oeis.a198;
// Generated by gen_seq4.pl eulerxfm 0 0 at 2020-09-17 12:15
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a003.A003136;
import irvine.oeis.transform.EulerTransform;


/**
 * A198726 Number of partitions of n into positive Loeschian numbers (cf. A003136).
 * @author Georg Fischer
 */
public class A198726 extends EulerTransform {

  /** Construct the sequence. */
  public A198726() {
    super(new CharacteristicFunction(new A003136().skip(1)), 1);
  }
}

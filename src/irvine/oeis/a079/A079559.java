package irvine.oeis.a079;
// Generated by gen_seq4.pl charfun at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a005.A005187;

/**
 * A079559 Number of partitions of n into distinct parts of the form 2^j-1, j=1,2,....
 * @author Georg Fischer
 */
public class A079559 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A079559() {
    super(0, new A005187());
  }
}

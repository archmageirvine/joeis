package irvine.oeis.a059;

import irvine.oeis.InverseSequence;
import irvine.oeis.a007.A007599;

/**
 * A059983 First occurrence of n in A007599.
 * @author Sean A. Irvine
 */
public class A059983 extends InverseSequence {

  /** Construct the sequence. */
  public A059983() {
    super(new A007599(), 0, 0);
  }
}

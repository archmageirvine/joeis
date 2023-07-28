package irvine.oeis.a001;

import irvine.oeis.a000.A000142;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A001013 Jordan-Polya numbers: products of factorial numbers A000142.
 * @author Sean A. Irvine
 */
public class A001013 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A001013() {
    super(1, new A000142().skip(2));
  }
}

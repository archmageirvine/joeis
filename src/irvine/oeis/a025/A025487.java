package irvine.oeis.a025;

import irvine.oeis.a002.A002110;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A025487 Least integer of each prime signature A124832; also products of primorial numbers A002110.
 * @author Sean A. Irvine
 */
public class A025487 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A025487() {
    super(1, new A002110().skip());
  }
}


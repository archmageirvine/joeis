package irvine.oeis.a034;

import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007395;

/**
 * A034077 Decimal part of n-th root of a(n) starts with digit 0.
 * @author Sean A. Irvine
 */
public class A034077 extends PrependSequence {

  /** Construct the sequence. */
  public A034077() {
    super(2, new A007395(), 26, 9, 17, 33, 65, 129);
  }
}


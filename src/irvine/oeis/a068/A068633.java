package irvine.oeis.a068;

import irvine.oeis.PrependSequence;
import irvine.oeis.a067.A067599;

/**
 * A068633 a(1) = 11 by convention; for n &gt; 1, if n = p^a*q^b... then a(n) = concatenate(p,a,q,b,...).
 * @author Sean A. Irvine
 */
public class A068633 extends PrependSequence {

  /** Construct the sequence. */
  public A068633() {
    super(1, new A067599(), 11);
  }
}


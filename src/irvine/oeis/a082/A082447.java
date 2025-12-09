package irvine.oeis.a082;

import irvine.oeis.a073.A073047;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082447 a(n) = the number k such that s(k)=0 where s(0)=n and s(i)=s(i-1)-(s(i-1) modulo (i+1)).
 * @author Sean A. Irvine
 */
public class A082447 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082447() {
    super(1, new A073047(), k -> k.subtract(1));
  }
}


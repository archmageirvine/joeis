package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a090.A090210;

/**
 * A070227 a(n) = Sum_{k&gt;=0} (k+n)!^n/((k+n)!*(k!^n)*exp(1)).
 * @author Sean A. Irvine
 */
public class A070227 extends A090210 {

  private int mN = -1;

  /** Construct the sequence. */
  public A070227() {
    super(0);
  }

  @Override
  public Z next() {
    return bell(++mN, mN);
  }
}


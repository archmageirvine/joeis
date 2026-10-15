package irvine.oeis.a086;

import irvine.oeis.Combiner;

/**
 * A086888 a(n)=sqrt(s^2 - 4*p) where s=A086533(n), p=A086860(n).
 * @author Sean A. Irvine
 */
public class A086888 extends Combiner {

  /** Construct the sequence. */
  public A086888() {
    super(1, new A086533(), new A086860(), (s, p) -> s.square().subtract(p.multiply(4)).sqrt());
  }
}


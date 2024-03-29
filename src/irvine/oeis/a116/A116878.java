package irvine.oeis.a116;
// Generated by gen_seq4.pl hologf4/hologf at 2022-11-11 22:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A116878 Generalized Catalan numbers C(2,8;n)=C(8,2;n).
 * @author Georg Fischer
 */
public class A116878 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A116878() {
    // o.g.f. (7+65*x+9/2*x*(1-(1-64*x)^(1/2)))/(1+8*x)/(7+2*x)
    // recurrence -(7*n-7)*u(n)-(-390*n+1062)*u(n-1)-(-3696*n+9264)*u(n-2)-(-1024*n+2560)*u(n-3) = 0
    super(0, "[[0],[-2560,1024],[-9264,3696],[-1062,390],[7,-7]]", "[1,1,10,244]", 0);
  }
}

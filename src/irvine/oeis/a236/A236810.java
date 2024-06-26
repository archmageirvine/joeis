package irvine.oeis.a236;
// Generated by gen_seq4.pl A258293/parmof3 at 2023-12-22 18:56

import irvine.math.function.Functions;
import irvine.oeis.a258.A258293;

/**
 * A236810 Number of solutions to Sum_{k=1..n} k*c(k) = n! , c(k) &gt;= 0.
 * @author Georg Fischer
 */
public class A236810 extends A258293 {

  /** Construct the sequence. */
  public A236810() {
    super(0, 0, n -> Functions.FACTORIAL.z(n));
  }
}

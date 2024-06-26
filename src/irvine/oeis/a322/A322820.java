package irvine.oeis.a322;
// Generated by gen_seq4.pl 2024-06-20/lambdan at 2024-06-20 23:44

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a122.A122111;

/**
 * A322820 a(n) = A052126(n) * A006530(A052126(n)).
 * @author Georg Fischer
 */
public class A322820 extends LambdaSequence {

  private static final DirectSequence A122111 = new A122111();

  /** Construct the sequence. */
  public A322820() {
    super(1, n -> A122111.a(Functions.MAKE_ODD.z(A122111.a(n))));
  }
}

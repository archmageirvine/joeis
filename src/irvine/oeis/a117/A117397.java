package irvine.oeis.a117;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A117397 Column 3 of triangle A117396.
 * a(n)=1+sum(k=4,n+3,k!)*3/4!
 * @author Georg Fischer
 */
public class A117397 extends LambdaSequence {

  /** Construct the sequence. */
  public A117397() {
    super(0, n -> (Z.ONE).add(Integers.SINGLETON.sum(4, n + 3, k -> Functions.FACTORIAL.z(k)).multiply(Z.THREE).divide(Functions.FACTORIAL.z(4))));
  }
}

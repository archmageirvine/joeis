package irvine.oeis.a228;
// Generated by gen_seq4.pl 2025-04-15.ack/lambdan at 2025-04-15 19:24

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a008.A008966;
import irvine.oeis.a057.A057077;
import irvine.oeis.a349.A349741;

/**
 * A228885 Determinant of the n X n matrix with (i,j)-entry equal to 1 or 0 according as i + j is coprime to n or not.
 * @author Georg Fischer
 */
public class A228885 extends LambdaSequence {

  private static final DirectSequence A008966 = new A008966();
  private static final DirectSequence A057077 = new A057077();
  private static final DirectSequence A349741 = new A349741();

  /** Construct the sequence. */
  public A228885() {
    super(1, n -> A057077.a(n).multiply(A008966.a(n)).multiply(A349741.a(n)).multiply(Functions.PHI.z(n)));
  }
}

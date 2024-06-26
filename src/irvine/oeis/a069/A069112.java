package irvine.oeis.a069;
// Generated by gen_seq4.pl knest at 2023-03-02 20:46

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000225;

/**
 * A069112 Squarefree part of 2^n-1 : the smallest number such that a(n)*(2^n-1) is a square.
 * @author Georg Fischer
 */
public class A069112 extends A000225 {

  /** Construct the sequence. */
  public A069112() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.CORE.z(super.next());
  }
}

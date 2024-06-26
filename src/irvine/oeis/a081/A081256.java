package irvine.oeis.a081;
// Generated by gen_seq4.pl knest/jaguar at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001093;

/**
 * A081256 Greatest prime factor of n^3 + 1.
 * @author Georg Fischer
 */
public class A081256 extends A001093 {

  /** Construct the sequence. */
  public A081256() {
    super(1);
  }

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(super.next());
  }
}

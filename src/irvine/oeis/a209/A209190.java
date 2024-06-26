package irvine.oeis.a209;
// Generated by gen_seq4.pl knest/jaguar at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a004.A004086;

/**
 * A209190 Least prime factor of reversal of digits of n.
 * @author Georg Fischer
 */
public class A209190 extends A004086 {

  /** Construct the sequence. */
  public A209190() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}

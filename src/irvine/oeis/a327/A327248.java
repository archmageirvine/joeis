package irvine.oeis.a327;
// Generated by gen_seq4.pl knest at 2023-03-02 20:46

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a078.A078522;

/**
 * A327248 Squarefree part of A078522(n+1).
 * @author Georg Fischer
 */
public class A327248 extends A078522 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.CORE.z(super.next());
  }
}

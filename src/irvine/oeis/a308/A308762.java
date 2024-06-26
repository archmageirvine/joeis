package irvine.oeis.a308;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A308762 Sum of the third largest parts of the partitions of n into 4 squarefree parts.
 * a(n)=sum(k=1,floor(n/4),sum(j=k,floor((n-k)/3),sum(i=j,floor((n-j-k)/2),j*moebius(k)^2*moebius(j)^2*moebius(i)^2*moebius(n-i-j-k)^2)))
 * @author Georg Fischer
 */
public class A308762 extends LambdaSequence {

  /** Construct the sequence. */
  public A308762() {
    super(0, n -> Integers.SINGLETON.sum(1, n / 4, k -> Integers.SINGLETON.sum(k, (n - k) / 3, j -> Integers.SINGLETON.sum(j, (n - j - k) / 2, i -> Z.valueOf(j).multiply(Z.valueOf(Functions.MOBIUS.i(k)).square()).multiply(Z.valueOf(Functions.MOBIUS.i(j)).square()).multiply(Z.valueOf(Functions.MOBIUS.i(i)).square()).multiply(Z.valueOf(Functions.MOBIUS.i(n - i - j - k)).square())))));
  }
}

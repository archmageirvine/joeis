package irvine.oeis.a308;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A308845 Sum of the largest parts in the partitions of n into 5 squarefree parts.
 * a(n)=sum(l=1,floor(n/5),sum(k=l,floor((n-l)/4),sum(j=k,floor((n-k-l)/3),sum(i=j,floor((n-j-k-l)/2),(n-i-j-k-l)*moebius(l)^2*moebius(k)^2*moebius(j)^2*moebius(i)^2*moebius(n-i-j-k-l)^2))))
 * @author Georg Fischer
 */
public class A308845 extends LambdaSequence {

  /** Construct the sequence. */
  public A308845() {
    super(0, n -> Integers.SINGLETON.sum(1, n / 5, l -> Integers.SINGLETON.sum(l, (n - l) / 4, k -> Integers.SINGLETON.sum(k, (n - k - l) / 3, j -> Integers.SINGLETON.sum(j, (n - j - k - l) / 2, i -> Z.valueOf(n - i - j - k - l).multiply(Z.valueOf(Functions.MOBIUS.i(l)).square()).multiply(Z.valueOf(Functions.MOBIUS.i(k)).square()).multiply(Z.valueOf(Functions.MOBIUS.i(j)).square()).multiply(Z.valueOf(Functions.MOBIUS.i(i)).square()).multiply(Z.valueOf(Functions.MOBIUS.i(n - i - j - k - l)).square()))))));
  }
}

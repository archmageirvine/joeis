package irvine.oeis.a225;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A225506 -2-Knödel numbers.
 * @author Georg Fischer
 */
public class A225506 extends AbstractSequence {

  private int mN;
  private int mK;

  /** Construct the sequence. */
  public A225506() {
    this(1, -2);
  }

  /**
   * Generic constructor with parameters
   * @param offset
   * @param k
   */
  public A225506(final int offset, final int k) {
    super(offset);
    mN = 1;
    mK = k;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!Predicates.PRIME.is(mN)) {
        boolean ok = true;
        for (int a = 1; a <= mN; ++a) {
          if (Functions.GCD.i(a, mN) == 1) {
            if (Z.valueOf(a).pow(mN - mK).subtract(1).mod(mN) != 0) {
              ok = false;
            }
          }
        }
        if (ok) {
          return Z.valueOf(mN);
        }
      }
    }
  }
  
/*
for n from 2 to q do 
  if not isprime(n) then 
    ok:=1; 
    for a from 1 to n do
      if gcd(a, n)=1 then 
        if (a^(n-k)-1) mod n<>0 then 
          ok:=0; 
          break; 
        fi; 
      fi;
    od; 
    if ok=1 then 
      print(n); 
    fi; 
  fi; 
od; 
*/
}

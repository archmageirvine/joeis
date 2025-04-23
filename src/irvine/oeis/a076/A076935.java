package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A076935 a(1)=1, a(n)=n-a(n-1)+a(a(n-1))-a(a(a(n-1)))+a(a(a(a(n-1))))-a(a(a(a(a(n-1))))).
 * @author Sean A. Irvine
 */
public class A076935 extends CachedSequence {

  /** Construct the sequence. */
  public A076935() {
    super(1, Integer.class, (self, n) -> n == 1
      ? Z.ONE
      : Z.valueOf(n)
      .subtract(self.a(n-1))
      .add(self.a(self.a(n-1)))
      .subtract(self.a(self.a(self.a(n-1))))
      .add(self.a(self.a(self.a(self.a(n-1)))))
      .subtract(self.a(self.a(self.a(self.a(self.a(n-1)))))));
  }
}


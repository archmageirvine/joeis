package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a090.A090946;

/**
 * A023502 <code>a(n) = b(n) + d(n)</code>, where <code>b(n) = (n-th</code> Fibonacci number <code>&gt; 2 )</code> and <code>d(n) = (n-th</code> number that is <code>1, 2</code>, or 3, or is not a Lucas number).
 * @author Sean A. Irvine
 */
public class A023502 extends A000045 {

  final Sequence mA = new PrependSequence(new SkipSequence(new A090946(), 2), 0, 1, 2, 3);
  {
    super.next();
    super.next();
    super.next();
    next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}

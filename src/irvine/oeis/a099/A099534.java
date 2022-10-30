package irvine.oeis.a099;
// manually dersimpln at 2021-08-25 11:05

import irvine.math.z.Z;
import irvine.oeis.a046.A046975;

/**
 * A099534 a(n)=Sum of the first n decimal places of e.
 * @author Georg Fischer
 */
public class A099534 extends A046975 {

  {
    setOffset(1);
    super.next();
  }
  
  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}

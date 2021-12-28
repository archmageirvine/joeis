package irvine.oeis.a284;

import irvine.math.z.Z;

/**
 * A284208 Binary representation of generation n in the reversible cellular automaton RCA(3) when started with a single ON cell at generation 0.
 * @author Georg Fischer
 */
public class A284208 extends A284209 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}

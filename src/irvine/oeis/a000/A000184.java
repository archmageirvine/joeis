package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a029.A029887;

/**
 * A000184 Number of genus 0 rooted maps with 3 faces with n vertices.
 * @author Sean A. Irvine
 */
public class A000184 extends A029887 {

  /** Construct the sequence. */
  public A000184() {
    super(2);
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}


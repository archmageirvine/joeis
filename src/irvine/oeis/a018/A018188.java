package irvine.oeis.a018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.zip.GZIPInputStream;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.FiniteSequence;

/**
 * A018188.
 * @author Sean A. Irvine
 */
public class A018188 extends FiniteSequence {

  private static List<Z> suckInNumbers() {
    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(new GZIPInputStream(A018188.class.getClassLoader().getResourceAsStream("irvine/oeis/a018/a018188.dat.gz"))))) {
      return ZUtils.suckInNumbers(reader);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  /** Construct the sequence. */
  public A018188() {
    super(suckInNumbers());
  }
}


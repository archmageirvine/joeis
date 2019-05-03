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
 * A018188 The <code>$620</code> prime list.
 * @author Sean A. Irvine
 */
public class A018188 extends FiniteSequence {

  static List<Z> suckInNumbers(final String res) {
    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(new GZIPInputStream(A018188.class.getClassLoader().getResourceAsStream(res))))) {
      return ZUtils.suckInNumbers(reader);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  /** Construct the sequence. */
  public A018188() {
    super(suckInNumbers("irvine/oeis/a018/a018188.dat.gz"));
  }
}

